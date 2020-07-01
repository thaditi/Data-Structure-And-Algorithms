# Problem: Reconstruct a String from its Burrows–Wheeler Transform

## Problem Introduction:

The Burrows–Wheeler transform of a string Text permutes the
symbols of Text making it well compressible. However, there were no sense in this, if this process would not be reversible. It turns out that it is reversible, and your goal in this problem is to recover Text from BWT(Text).

## Task:

Reconstruct a string from its Burrows–Wheeler transform.

## Input Format:

A string Transform with a single “\$” sign.

## Constraints:

1 ≤ |Transform| ≤ 1 000 000; except for the last symbol, Text contains symbols A, C, G, T
only.

## Output Format:

The string Text such that BWT(Text) = Transform. (There exists a unique such string.)

## Sample:

```
Input:
AGGGAA$
Output:
GAGAGA$

```

𝑀(Text) =

⎡$ 𝐺 𝐴 𝐺 𝐴 𝐺 𝐴⎤
⎢𝐴 $ 𝐺 𝐴 𝐺 𝐴 𝐺⎥
⎢𝐴 𝐺 𝐴 $ 𝐺 𝐴 𝐺⎥
⎢𝐴 𝐺 𝐴 𝐺 𝐴 $ 𝐺⎥
⎢𝐺 𝐴 $ 𝐺 𝐴 𝐺 𝐴⎥
⎢𝐺 𝐴 𝐺 𝐴 $ 𝐺 𝐴⎥
⎣𝐺 𝐴 𝐺 𝐴 𝐺 𝐴 \$⎦
