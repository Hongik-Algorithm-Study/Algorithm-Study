n = int(input())

if n == 1:
    result = 1
else:
    result = 1
    room_count = 1
    
    while room_count < n:
        room_count += 6 * result
        result += 1

print(result)