function mergeSort(arr)
  if arr.length <= 1
    return
  mid = arr.length / 2
  left = mergeSort(arr[0...mid])
  right = mergeSort(arr[mid...arr.length])
  mergeSort(left)
  mergeSort(right)
  merge(left, right,arr)
  
function merge(left, right)
  while indexleft < left.length and indexright < right.length
    if left[0] <= right[0]
      result.push(left.shift())
    else
      result.push(right.shift())
      
  while indexleft < left.length
    result.push(...left)
  while indexright< right.length
    result.push(...right)