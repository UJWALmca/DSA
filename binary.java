def sort_zeroes_ones(arr):
    zeros = arr.count(0)
    ones = len(arr) - zeros
    sorted_arr = [0] * zeros + [1] * ones
    return sorted_arr

if __name__ == "__main__":
    # Taking input from the user
    n = int(input("Enter the number of elements: "))
    arr = []
    for i in range(n):
        element = int(input(f"Enter element {i+1}: "))
        arr.append(element)

    sorted_arr = sort_zeroes_ones(arr)
    print("Sorted array:", sorted_arr)
