def remove_duplicates(nums):
    if not nums:
        return 0
    
    # Initialize the unique element index
    i = 0
    
    for j in range(1, nums.length):
        if nums[j] != nums[i]:
            i += 1
            nums[i] = nums[j]
    
    # The number of unique elements
    return i + 1
