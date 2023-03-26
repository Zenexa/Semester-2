B = "B"
C = "C"
for i in range(4):
    for j in range(2):
        print(B,C,end=" ")
    print(" ")
    B,C = C,B
    
    
for i in range(3,0,-1):
    print("*" * i)