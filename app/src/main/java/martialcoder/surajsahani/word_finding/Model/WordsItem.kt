package martialcoder.surajsahani.word_finding.Model


import com.google.gson.annotations.SerializedName

data class WordsItem(
    val score: Int,
    val tags: List<String>,
    val word: String
)