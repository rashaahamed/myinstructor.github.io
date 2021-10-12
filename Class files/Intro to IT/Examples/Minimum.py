# Find the minimum in a list of numbers
# Python

nums = [77, 2, 99, -1, 0]
min = nums[0]

for num in nums:
    if num < min:
        min = num

print(min)
