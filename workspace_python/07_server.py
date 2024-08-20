from flask import Flask, request, render_template

# flask 초기화
app = Flask(__name__)

'''
function home90{
    return 'hello web'
}
'''
@app.route("/home")
def home() :
    a = 10
    print(a)
    return 'hello web' 

@app.route("/login", methods=['GET', 'POST'])
def login() :
    # 넘겨받는 파라메터출력
    print(request.method)

    if request.method == 'GET' :
        # GET 방식
        id = request.args.get("id")
        print("id : ", id)
    elif request.method== 'POST' :
         # POST방식
        id = request.form.get("id")
        print("id : ", id)
    else :
        print("다른 메소드")
    # ID = request.form.get("id")

   # return f'너의 아이디는 your id is {id} 입니다'
    return render_template('main.html', id2=id, d={'k': 'v'})

@app.route("/join")
def join() :
    return render_template('join.html')

# 서버 구동
# flask 기본 포트 : 5000
app.run(port =5000, debug=True)
