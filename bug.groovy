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
```