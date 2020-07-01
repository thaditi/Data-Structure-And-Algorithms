# Problem: Construct the Burrows–Wheeler Transform of a String

## Problem Introduction:

The Burrows–Wheeler transform of a string Text permutes the symbols of Text so that it becomes well
compressible. Moreover, the transformation is reversible: one can recover the initial string Text from its Burrows–Wheeler transform. However, data compression is not its only application: it is also used for solving the multiple pattern matching problem and the sequence alignment problem.
BWT(Text) is defined as follows. First, form all possible cyclic rotations of Text; a cyclic rotation is defined by chopping off a suffix from the end of Text and appending this suffix to the beginning of Text. Then, order all the cyclic rotations of Text lexicographically to form a |Text| × |Text| matrix of symbols denoted by 𝑀(Text). BWT(Text) is the last column of 𝑀(Text)

## Task:

Construct the Burrows–Wheeler transform of a string.

## Input Format:

A string Text ending with a “\$” symbol.

## Constraints:

1 ≤ |Text| ≤ 1 000; except for the last symbol, Text contains symbols A, C, G, T only.

## Output Format:

BWT(Text).

## Sample:

```
Input:
ACACACAC$
Output:
CCCC$AAAA

```

𝑀(Text) =

⎡$ 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶⎤
⎢𝐴 𝐶 $ 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶⎥
⎢𝐴 𝐶 𝐴 𝐶 $ 𝐴 𝐶 𝐴 𝐶⎥
⎢𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 $ 𝐴 𝐶⎥
⎢𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 $⎥
⎢𝐶 $ 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 𝐴⎥
⎢𝐶 𝐴 𝐶 $ 𝐴 𝐶 𝐴 𝐶 𝐴⎥
⎢𝐶 𝐴 𝐶 𝐴 𝐶 $ 𝐴 𝐶 𝐴⎥
⎣𝐶 𝐴 𝐶 𝐴 𝐶 𝐴 𝐶 \$ 𝐴⎦
