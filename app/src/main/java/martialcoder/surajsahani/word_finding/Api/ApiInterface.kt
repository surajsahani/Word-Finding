package martialcoder.surajsahani.word_finding.Api

import martialcoder.surajsahani.word_finding.Model.Words
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

     //https://api.datamuse.com/words?ml=ringing+in+the+ears
    @GET("words")
    fun getwords(@Query("ml") ml : String): Call<Words>
}