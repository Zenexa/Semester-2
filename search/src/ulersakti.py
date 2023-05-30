def linearsearch(arr, key):
    tampung = []

    for i in range(len(key)):
        found = False
        for j in range(len(arr)):
            if arr[j] == key[i]:
                tampung.append(j)
                found = True
                break
        if not found:
            tampung.append(-1)
    for i in tampung:
        if i == -1:
            print("nilai " + str(key[tampung.index(i)]) + " tidak ditemukan")
        else:
            print("nilai " + str(key[tampung.index(i)]) + " ditemukan di indeks " + str(i))

arr = [23, 3, 43, 32, 4, 53]
key = [24.4, 32, 53]

linearsearch(arr, key)