# Groovy eachWithIndex premature loop termination
This example demonstrates a common error in Groovy where using `return` inside an `eachWithIndex` loop prematurely exits the loop, not just the current iteration.  This can lead to unexpected behavior if you're not aware of this behavior.

## Bug
The `myMethod` function iterates through a list. If a null item is encountered, it prints a message and uses `return`, intending to skip the rest of the processing for that null element. However, this actually exits the entire `eachWithIndex` loop.