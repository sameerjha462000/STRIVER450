 ## Error spotted in wrong.java
    Added 20 October 2022
    This approach would skip the pairs
    Dry run on left = [3, 4, 5] and right = [1, 2]
    The reverse pairs are (3, 1), (4, 1), (5, 1) and (5, 2). Thus there are 4 pairs
    but our algorithm would count only 3 pairs, It will skip the pair (5, 2)
