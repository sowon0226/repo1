a = [1, 1.2, 'word', True]
print(a)
print( a[1] )
#print( a[10] )  # 범위를 벗어나는 경우 오류발생
print( a[-2] ) # 음수 index는 뒤에서부터 센다. 맨 마지막이 -1

a[3] = False
a[-1] = False

print('abcd'[0]) # 문자열도 배열로 취급한다
print( a[2][1] ) # 배열안에 있는 글자뽑기

# 초기화 할수도 있다ㅕ[ㅕ]
a = []
a = list()

# range
# range(시작index, 종료index, step)
# 시작index부터 종료index바로 앞까지 step 만큼 증가
# 시작 index 기본값 : 0
# step 기본값 : 1
a = range(10)
print(a)
print( list(a) )
print( list( range(4, 10, 2) ) ) # 4부터 10바로 앞까지 2씩 증가
print( list( range(10, 0, 2) ) ) # 종료 인덱스가 시작 인덱스보다 적으면 아무것도 나오지 않는다
print( list( range(10, 0, -1) ) ) # step도 음수가 될수 있다 이럴때는 시작 인덱스와 종료 인덱스를 반대로 적어준다 

a = [100,15,13,1,1,26,41,1,1]

a.append(52) # 리스트 마지막에 추가
print(a)

a.sort() # 오름차순으로 정렬
print(a)

print('!')
a.sort(reverse=True) # 내림차순이 없기때문에 이런식으로 도 쓴다.
print(a)


a.reverse() # 배열 뒤집기
print(a)
a.sort()
print(a)

print(a.index(15)) # 전달인자와 같은 값이 있는 인덱스 번호를 반환한다

a.insert(1,200) # 첫번째 전달인자에 해당하는 인덱스를 두번째 전달인자의 값으로 끼워넣는다. (나머지는 뒤로 밀린다)
print(a)

a.remove(1) # 순차적으로 첫번째 나오는 값을 삭제
print(a)

x = a.pop() # 맨뒤에 값을 빼고 리턴해준다 변수에 담을 수 있다.
print(x)
print(a)

print(a.count(1)) # 전달인자와 같은 값이 몇개가 있는지 카운트 된다.

b = [-1, -2]
a.extend(b) # 배열 합치기 a += b 와 같다. 리턴값이 없다 
print(a)

# 숫자로만 이루어져있는 배열은 밑에 min,max,sum 도 가능하다
print( min(a))
print( max(a))
print( sum(a))


