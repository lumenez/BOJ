#*****************************************************************************#
# 2009 Winter. Python 8                                                       #
# 8. 간단한 게임 increasing.py를 만든다. 이 프로그램을 수행하면 사각형 박스에 #
#    어떤 양의 정수가 100여개가 나타난다.                                     #
#    각 정수는 작은 아이콘에 randomly 뿌려진다.                               #
#    정수는 1이상 1000 이하의 값을 가진다.                                    #
#    사용자는 어떤 정수를 골라서 하나씩 click 한다.                           #
#    단 click하는 숫자는 반드시 증가하는 순서가 되어야 한다.                  #
#    이 작업 시간은 10초로 제한되어 있다.                                     #
#    10초가 지나면 “Game Over"를 표시하고 게임은 끝을 낸다. (게임을 시작하기  #
#    전에 사용자 이름을 넣고 이들의 score를 score list로 저장한다.)           #                                                               #
#                                                                             #
#   * Program file : increasing.py                                            #
#   * Input file : None                                                       #
#   * Output file : None                                                      #
#                                                     by. Kwon Arum           #
#*****************************************************************************#

#-*- coding: cp949 -*-
#!/usr/bin/env python

import wx
import random

class InsertFrame(wx.Frame):
    def __init__(self, parent, id):
        wx.Frame.__init__(self, parent, id, 'Find the correct number!', size=(730, 520))
        self.panel = wx.Panel(self)
        self.count = 0 # 현재까지 진행 시간
        self.cur_score = 0 # 현재 게임을 진행중인 사용자의 점수
        self.clicked = random.randrange(0,5,1) # 사용자가 이전에 클릭한 숫자
        self.grade = 8 # 게임 등급 (10 : 상, 5 : 중, 3 : 하)
        self.time = 1 # 게임 시간 (10초, 20초, 30초)
        self.btn_list = [] # 숫자 버튼의 리스트
        
        static_named = wx.StaticText(self.panel, -1,
                    u"▷ 신급에서 3개 이상 클릭하신다면 이 게임을 완료하신거나 다름없습니다. ^^", (10, 440))
        static_names = wx.StaticText(self.panel, -1,
                    u"☆ 아래에 제시된 숫자를 찾아 누르는 게임입니다.", (10, 5))
        static_name = wx.StaticText(self.panel, -1,
                    u"※ 사용자 이름은 7자 내의 영문과 숫자로만 입력해주세요.", (400, 5))
        static1 = wx.StaticText(self.panel, wx.NewId(), u"사용자 이름 : ", (470,32))
        self.static2 = wx.StaticText(self.panel, wx.NewId(), u"대기중입니다.", (400,220))
        self.username = wx.TextCtrl(self.panel, wx.NewId(), "", pos=(550, 30), size=(150, -1))
        self.btn_start = wx.Button(self.panel, label="START", pos=(400, 60), size=(300, 60))
        self.g1 = wx.Gauge(self.panel, -1, 30, (400, 250), (300, 50))

        self.timer = wx.Timer(self)
        self.Bind(wx.EVT_BUTTON, self.OnStart, self.btn_start)
        self.Bind(wx.EVT_CLOSE, self.OnCloseWindow)
        self.Bind(wx.EVT_TIMER, self.TimerHandler)

        self.g_list = {} # 점수 출력을 위한 등급 리스트
        self.g_list[8] = 'Hard'
        time_list = [u'1초(신)', u'3초(중고수)', u'5초(초보)']
        sizer = wx.BoxSizer(wx.VERTICAL)

        self.rb2 = wx.RadioBox(
                self.panel, -1, u"제한 시간", (400, 140), wx.DefaultSize,
                time_list, 3, wx.RA_SPECIFY_COLS | wx.NO_BORDER)
        sizer.Add(self.rb2, 0, wx.ALL, 20)
        self.Bind(wx.EVT_RADIOBOX, self.OnTime, self.rb2)

        self.abc = wx.StaticText(self.panel,label=str(self.clicked), pos=(500,300))
        tfont = wx.Font(100, wx.DEFAULT, wx.NORMAL, wx.NORMAL)
        self.abc.SetFont(tfont)

        menuFile = wx.Menu()
        menuFile.Append(1, "&Makers")
        menuFile.AppendSeparator()
        menuFile.Append(2, "E&xit")

        menuBar = wx.MenuBar()
        menuBar.Append(menuFile, "&File")
        
        self.SetMenuBar(menuBar)
        self.Bind(wx.EVT_MENU, self.OnAbout, id=1)
        self.Bind(wx.EVT_MENU, self.OnQuit, id=2)
        
        # 처음 시작시에 버튼 100개를 모두 만들고 숨겨둔다.
        for i in range(0, 8):
            for j in range (0, 8):
                btn_num = wx.Button(self.panel, i*8+j, label=str(i*8+j),
                          pos=(j*45+15, i*45+40), size=(45, 45))
                self.btn_list.append(btn_num)
                self.Bind(wx.EVT_BUTTON, self.OnClick, self.btn_list[i*8+j])
                self.btn_list[i*8+j].Hide() # 버튼 숨기기

    # 등급 라디오박스 클릭 이벤트 핸들러
    def OnGrade(self, event):
        temp = event.GetInt()
        if temp == 0:
            self.grade = 8

    # 시간 라디오박스 클릭 이벤트 핸들러
    def OnTime(self, event):
        temp = event.GetInt()
        if temp == 0:
            self.time = 1
        if temp == 1:
            self.time = 3
        if temp == 2:
            self.time = 5

    #게임 시작전 상태로 초기화
    def OnInit(self): 
        self.count = 0
        self.cur_score = 0
        self.clicked = random.randrange(0,5,1)
        self.btn_start.Enable()
        self.username.Enable()
        self.rb2.Enable()
        self.g1.SetValue(0)
        self.static2.SetLabel(u"대기중입니다.")
        for a_btn in self.btn_list:
            a_btn.Hide() # 모든 버튼을 다시 숨김
        self.abc = wx.StaticText(self.panel,label=str(self.clicked), pos=(500,300))
        tfont = wx.Font(100, wx.DEFAULT, wx.NORMAL, wx.NORMAL)
        self.abc.SetFont(tfont)

    # 게임 시작을 위해 설정값을 적용하여 화면 구성 및 변수 설정
    def OnSetting(self):
        g = self.grade
        i = j = 0

        self.static2.SetLabel(u"현재 점수 : 0")
        self.g1.SetRange(self.time)
        self.rb2.Disable()
        self.btn_start.Disable()
        self.username.Disable()

        for i in range(0, g):
            for j in range (0, g):
                rand_num = int(random.random()* 5) # 랜덤 숫자 생성
                
                self.btn_list[i*8+j].SetLabel(str(rand_num))
                self.btn_list[i*8+j].Enable() # 버튼 활성화
                self.btn_list[i*8+j].Show() # 버튼 보이기
                    
                    
    # 게임 시작 버튼 이벤트 핸들러
    def OnStart(self, event): 
        if len(self.username.GetLabelText()) < 1:
            dlg = wx.MessageDialog(self, u"사용자 이름을 입력하셔야합니다.",
                  "Name", wx.OK | wx.ICON_INFORMATION)
            dlg.ShowModal()
            dlg.Destroy()
        else:
            if len(self.username.GetLabelText()) > 7:
                dlg = wx.MessageDialog(self, u"사용자 이름을 7글자 이하로 입력해주세요.",
                      "Name", wx.OK | wx.ICON_INFORMATION)
                dlg.ShowModal()
                dlg.Destroy()
            else:
                self.OnSetting()
                self.timer.Start(1000) # 1초마다 타이머 이벤트 발생

    # 숫자 버튼 클릭 이벤트 핸들러
    def OnClick(self, event): 
        self.btn_list[event.GetId()].Disable()
        cur_click = int(self.btn_list[event.GetId()].GetLabelText())

        if self.clicked > cur_click or self.clicked < cur_click: # 이전에 클릭한 수 보다 더 낮은 숫자를 클릭했을 경우
            self.OnGameOver()
        else:
            self.cur_score += 1
            # 표시된 모든 버튼을 클릭하여 게임을 끝냈을 경우
            if self.cur_score >= self.grade*self.grade:
                self.OnGameOver()
            else:
                self.clicked = cur_click
                self.static2.SetLabel(u"현재 점수 : "  + str(self.cur_score))

    # 게임 종료
    def OnGameOver(self):
        self.timer.Stop()
        result = "Game Over!!  \n"
        result += self.username.GetValue() + " - Score : " + str(self.cur_score) + '\n\n'
        result += "---------------------------------------------\n"
        result += " Rank\tName\tScore\tGrade\tTimer\n"
        result += "---------------------------------------------\n"
        result += self.SaveScore()
        dlg = wx.MessageDialog(self, result, "Increasing", wx.OK | wx.ICON_INFORMATION)
        dlg.ShowModal()
        dlg.Destroy()
        self.OnInit()

    # 게임 종료시 점수 저장
    def SaveScore(self):
        f_dic = open("increasing_score_list.dat", 'r')
        content = (f_dic.read()).splitlines()
        score_list = {}
        for line in content: # 한 score는 점수, 난이도, 시간으로 이루어짐
            score_list[line.split()[1]] = int(line.split()[2]), line.split()[3], int(line.split()[4])

        name = self.username.GetValue()
        if score_list.has_key(name): # 점수 리스트에 같은 이름으로 등록된 점수가 있을 경우
            if score_list[name][0] < self.cur_score: # 현재 점수가 더 높아야만 갱신
                score_list[name] = self.cur_score, self.g_list[self.grade], self.time
        else: # 등록된 점수가 없을 경우 새로 등록
            score_list[name] = self.cur_score, self.g_list[self.grade], self.time
        # 점수별로 내림차순 정렬
        self.new_list = reversed(sorted(score_list.items(), key=lambda item:item[1]))
        
        print_res = ""
        result = ""
        i = j = 1
        for key, value in self.new_list: # 모두 출력
            temp = str(i) + '.\t' + key + '\t'
            temp += str(value[0]) + '\t' + str(value[1]) + '\t' + str(value[2]) + '\n'
            i += 1
            result += temp
            if j <= 10 :
                print_res += temp
                j += 1

        f_dic = open("increasing_score_list.dat", 'w')
        f_dic.write(result)
        f_dic.close()

        return print_res # 메시지박스에 표시하기 위해서 출력
    
    # 타이머 이벤트 핸들러
    def TimerHandler(self, event):
        self.count = self.count + 1
        self.g1.SetValue(self.count) # Gauge 증가
        if self.count >= self.time: # 선택한 시간이 넘으면 게임 종료
            self.count = 0
            self.OnGameOver()

    def OnCloseWindow(self, event):
        self.Destroy()

    def OnQuit(self, event):
        self.Close()

    def OnAbout(self, event):
        wx.MessageBox("This is made by \n200924464 JM \n200924531 YB",
                "Who made this?", wx.OK | wx.ICON_INFORMATION, self)

if __name__ == '__main__':
    app = wx.PySimpleApp()
    frame = InsertFrame(parent=None, id=-1)
    frame.Show()
    app.MainLoop()