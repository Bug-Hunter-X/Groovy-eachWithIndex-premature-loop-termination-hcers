```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      return //This will exit the eachWithIndex loop prematurely
    }
    //Process the item
  }
}

myMethod([1, 2, null, 4, 5])


def myMethodCorrected(list) {
  list.eachWithIndex { item, index ->
    if (item != null) {
      // Process the item
      println "Processing item: $item at index: $index"
    } else {
      println "Null item found at index: $index"
    }
  }
}

myMethodCorrected([1, 2, null, 4, 5])
```