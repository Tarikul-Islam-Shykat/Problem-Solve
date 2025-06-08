class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    var finaList = mutableListOf<List<String>>()
    var sortedProducts = products.sorted() // this is sort the words lexicographically
    var prefix = ""
    for (character in searchWord) {
        prefix += character;
        var suggestion = sortedProducts.filter { it.startsWith(prefix) }.take(3)
        finaList.add(suggestion)
    }
    return finaList
    }
}
