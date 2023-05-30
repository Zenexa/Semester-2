def linearsearch(arr,key):
    f = open("result.txt", "w")
    for i in range(len(arr)):
        found = False
        for j in key:
            if arr[i] == j:
                f.write(str(i)+"\n")
                found = True
        if not found:
            f.write("not found\n")
            
    f.close()

arr = [1,5,6,7,8,9,3]
key = [2,6,9,3]
linearsearch(arr,key)


f_read = open("result.txt",'r')
print(f_read.read())
f_read.close()