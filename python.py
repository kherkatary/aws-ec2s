import random

def generate_random_list(length):
    return [random.randint(1, 100) for _ in range(length)]

def find_max_value_in_list(nums):
    max_value = float('-inf')
    for num in nums:
        if num > max_value:
            max_value = num
    return max_value

# Example usage:
random_list = generate_random_list(10)
print("Randomly generated list:", random_list)

max_value = find_max_value_in_list(random_list)
print("Maximum value in the list:", max_value)

