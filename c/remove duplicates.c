int removeDuplicates(int* nums, int numsSize) {
    if (numsSize == 0) return 0;
    // Pointer 'i' tracks the index of the latest unique element
    int i = 0;
    // Pointer 'j' iterates through the rest of the array
    for (int j = 1; j < numsSize; j++) {
        // If we find a new unique element
        if (nums[j] != nums[i]) {
            i++;             // Move the unique element pointer
            nums[i] = nums[j]; // Update the next position with the new value
        }
    }
    // Return the number of unique elements (index + 1)
    return i + 1;
}
