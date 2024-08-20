a = 10
naver =1
nvaer = 2 # 변수 오타 주의

b = a // 3
print(b)
print( -a // 3) # //(나누기) 내림
print( a % 3)

print( 2 ** 10) # 거듭 제곱

# int 자료형으로 형변환
a = int(-3.3)
print(a) # 실수일 경우 버림
print(int('100')+1)
# print(int('10asadf0')+1) # 에러도 확인해보기

# print = 10
# print(a)

a =10
print(type(a) ) # 변수가 어떤 타입인지 궁금하면 해보면 됨
a = 'abc'
print(type(a) )
print(type(print) )

# 정밀도
a = 0.12345678901234567890
print(a) # 파이썬의 정밀도 : 소수점 14자리까지만 정확하다

a, b, c = 10, 20, 30
print(a,b,c)

a, b = b, a

# 파이썬에선 앞에 대문자로
a = True
b = False
c = None # null 없고 대신에 None
# 파이썬에서 False로 인식되는 경우 : False, None, 0, 0.0, 빈 컨테이너
# True는 False가 아님

# a = input() # 스캐너에 해당됨
# print(a)
print('abc' == 'abc') # 문자도 ==으로 비교한다

a = 3 > 5
b = 7 > 5
print(a and b)
print(a or b)
print( not(a or b) )

id = '아이디'
html = '''
<div>
    <strong>아이디</strong>
</div>
'''
print(html)

html = f'''
<div>
    <strong>{id}</strong>
</div>
'''
print(html)

print("쌍따옴표 기호는 \" 입니다 ")

