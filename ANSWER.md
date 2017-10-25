# Answers
### 1. Why does `FixedArrayQueue` require an explicit constructor?
Because the capacity value must be set by a developer within other methods. Different FixedArrayQeues have to be built with different capacities, and the convention is to set that value in a constructor.
### 2. What happens when you offer an item to a full `FixedArrayQueue`?
It will not add that data anywhere within the 'data' array, and returns 'false'. In principle it just ignores the input, and informs the code calling FixedArrayQueue that it failed to be added.
### 3. What happens when you poll an empty `FixedArrayQueue`?
It returns false and does nothing to manipulate its data. As with 'FixedArrayQueue' it ignores the data, and signals that the operation did not happen.
### 4. What is the time and (extra) space complexity of each of the `FixedArrayQueue` methods?
##### Offer: O(n)
##### Peek: O(1)
##### Poll: O(1)
##### IsEmpty: O(1)
##### Size: O(1)
##### AsList: O(n)