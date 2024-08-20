# 시퀀스 객체란?
# 리스트, 튜플, 문자열, range 등 반복할 수 있는 객체
a = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
print( 30 in a) # in : 시퀀스에 특정 값이 있는지 조사

print( 100 not in a)
print('o' in 'hello')
print ( 3 in range(0, 10, 2))

b = [1, 2, 3]
print(a+b)
print('hello' + 'world')

# 파이썬에서는 문자열 + 문자열만되고,
# 시퀀스에서는 시퀀스 + 시퀀스만 가능
# print('hello' + 3) 시퀀스 객체가 아니여서 오류

print('hello' + str(3) )

print( b * 4)
print('hello' * 3)
print('-' * 30)

print( len(a))
print('한글')

# del은 다 지울수 있음
print(a)
del a[1]
print(a)

c = "abcde"
print(c[0])
#c[0] = 'b' # index로 접근접근하는 경우 range, 튜플, 문자열은 읽기만 된다

# 슬라이스 빠르게 범위를 정해서 가져오는거
# 슬라이스는 [index]로 접근할 수 있는 모든 것에 적용됨
# [시작index, 종료index, step]
# 시작 index부터 종료 index 바로 앞까지 step씩 증가하면서 읽
# 종료 index가 원본의 길이보다 커도 원본의 길이만큼만 읽는다
# 시작 index 기본값 : 0
# 종료 index 기본값 : len() 즉 lrngth
# step 기본값 : 1
print( a[0:3])
print( a[:3] )  # 시작index 생략 시 처음부터
print( a[3:] )  # 종료index 생략 시 끝까지
print( a[:] )   # a[::]랑 같음
print( a[::2] ) # 모두 출력인데 2개씩 건너띄면서
print( a[5:1:-1]) # step을 음수로 지정할 수 있다

a[0] = 100;
a[2:4] = [1,2]
print(a)
a[2:4] = [1]
print(a)
a[2:4] = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(a)
a[2:8:2] = [-1, -2, -3] # step이 있는 경우 할당 개수가 정확해야한다
print(a)
del a[2:8:2]
print(a)