package by.zharikov.recipes.dto


import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("from")
    val from: Int? = null,
    @SerializedName("hits")
    val hits: List<Hit?>? = null,
    @SerializedName("more")
    val more: Boolean? = null,
    @SerializedName("q")
    val q: String? = null,
    @SerializedName("to")
    val to: Int? = null
) {
    data class Hit(
        @SerializedName("bookmarked")
        val bookmarked: Boolean? = null,
        @SerializedName("bought")
        val bought: Boolean? = null,
        @SerializedName("recipe")
        val recipe: Recipe? = null
    ) {
        data class Recipe(
            @SerializedName("calories")
            val calories: Double? = null,
            @SerializedName("cautions")
            val cautions: List<String?>? = null,
            @SerializedName("dietLabels")
            val dietLabels: List<String?>? = null,
            @SerializedName("digest")
            val digest: List<Digest?>? = null,
            @SerializedName("healthLabels")
            val healthLabels: List<String?>? = null,
            @SerializedName("image")
            val image: String? = null,
            @SerializedName("ingredientLines")
            val ingredientLines: List<String?>? = null,
            @SerializedName("ingredients")
            val ingredients: List<Ingredient?>? = null,
            @SerializedName("label")
            val label: String? = null,
            @SerializedName("shareAs")
            val shareAs: String? = null,
            @SerializedName("source")
            val source: String? = null,
            @SerializedName("totalDaily")
            val totalDaily: TotalDaily? = null,
            @SerializedName("totalNutrients")
            val totalNutrients: TotalNutrients? = null,
            @SerializedName("totalTime")
            val totalTime: Int? = null,
            @SerializedName("totalWeight")
            val totalWeight: Double? = null,
            @SerializedName("uri")
            val uri: String? = null,
            @SerializedName("url")
            val url: String? = null,
            @SerializedName("yield")
            val yield: Int? = null
        ) {
            data class Digest(
                @SerializedName("daily")
                val daily: Double? = null,
                @SerializedName("hasRDI")
                val hasRDI: Boolean? = null,
                @SerializedName("label")
                val label: String? = null,
                @SerializedName("schemaOrgTag")
                val schemaOrgTag: String? = null,
                @SerializedName("sub")
                val sub: List<Sub?>? = null,
                @SerializedName("tag")
                val tag: String? = null,
                @SerializedName("total")
                val total: Double? = null,
                @SerializedName("unit")
                val unit: String? = null
            ) {
                data class Sub(
                    @SerializedName("daily")
                    val daily: Double? = null,
                    @SerializedName("hasRDI")
                    val hasRDI: Boolean? = null,
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("schemaOrgTag")
                    val schemaOrgTag: String? = null,
                    @SerializedName("tag")
                    val tag: String? = null,
                    @SerializedName("total")
                    val total: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )
            }

            data class Ingredient(
                @SerializedName("image")
                val image: Any? = null,
                @SerializedName("text")
                val text: String? = null,
                @SerializedName("weight")
                val weight: Double? = null
            )

            data class TotalDaily(
                @SerializedName("CA")
                val cA: CA? = null,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF? = null,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE? = null,
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL? = null,
                @SerializedName("FASAT")
                val fASAT: FASAT? = null,
                @SerializedName("FAT")
                val fAT: FAT? = null,
                @SerializedName("FE")
                val fE: FE? = null,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG? = null,
                @SerializedName("FOLDFE")
                val fOLDFE: FOLDFE? = null,
                @SerializedName("K")
                val k: K? = null,
                @SerializedName("MG")
                val mG: MG? = null,
                @SerializedName("NA")
                val nA: NA? = null,
                @SerializedName("NIA")
                val nIA: NIA? = null,
                @SerializedName("P")
                val p: P? = null,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT? = null,
                @SerializedName("RIBF")
                val rIBF: RIBF? = null,
                @SerializedName("THIA")
                val tHIA: THIA? = null,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA? = null,
                @SerializedName("VITA_RAE")
                val vITARAE: VITARAE? = null,
                @SerializedName("VITB12")
                val vITB12: VITB12? = null,
                @SerializedName("VITB6A")
                val vITB6A: VITB6A? = null,
                @SerializedName("VITC")
                val vITC: VITC? = null,
                @SerializedName("VITD")
                val vITD: VITD? = null,
                @SerializedName("VITK1")
                val vITK1: VITK1? = null,
                @SerializedName("ZN")
                val zN: ZN? = null
            ) {
                data class CA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class CHOCDF(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class CHOLE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class ENERCKCAL(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FASAT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FAT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FIBTG(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FOLDFE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class K(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class MG(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class NA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class NIA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class P(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class PROCNT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class RIBF(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class THIA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class TOCPHA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITARAE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITB12(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITB6A(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITC(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITD(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITK1(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class ZN(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )
            }

            data class TotalNutrients(
                @SerializedName("CA")
                val cA: CA? = null,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF? = null,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE? = null,
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL? = null,
                @SerializedName("FAMS")
                val fAMS: FAMS? = null,
                @SerializedName("FAPU")
                val fAPU: FAPU? = null,
                @SerializedName("FASAT")
                val fASAT: FASAT? = null,
                @SerializedName("FAT")
                val fAT: FAT? = null,
                @SerializedName("FATRN")
                val fATRN: FATRN? = null,
                @SerializedName("FE")
                val fE: FE? = null,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG? = null,
                @SerializedName("FOLAC")
                val fOLAC: FOLAC? = null,
                @SerializedName("FOLDFE")
                val fOLDFE: FOLDFE? = null,
                @SerializedName("FOLFD")
                val fOLFD: FOLFD? = null,
                @SerializedName("K")
                val k: K? = null,
                @SerializedName("MG")
                val mG: MG? = null,
                @SerializedName("NA")
                val nA: NA? = null,
                @SerializedName("NIA")
                val nIA: NIA? = null,
                @SerializedName("P")
                val p: P? = null,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT? = null,
                @SerializedName("RIBF")
                val rIBF: RIBF? = null,
                @SerializedName("SUGAR")
                val sUGAR: SUGAR? = null,
                @SerializedName("THIA")
                val tHIA: THIA? = null,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA? = null,
                @SerializedName("VITA_RAE")
                val vITARAE: VITARAE? = null,
                @SerializedName("VITB12")
                val vITB12: VITB12? = null,
                @SerializedName("VITB6A")
                val vITB6A: VITB6A? = null,
                @SerializedName("VITC")
                val vITC: VITC? = null,
                @SerializedName("VITD")
                val vITD: VITD? = null,
                @SerializedName("VITK1")
                val vITK1: VITK1? = null,
                @SerializedName("WATER")
                val wATER: WATER? = null,
                @SerializedName("ZN")
                val zN: ZN? = null
            ) {
                data class CA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class CHOCDF(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class CHOLE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class ENERCKCAL(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FAMS(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FAPU(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FASAT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FAT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FATRN(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FIBTG(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FOLAC(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FOLDFE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class FOLFD(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class K(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class MG(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class NA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class NIA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class P(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class PROCNT(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class RIBF(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class SUGAR(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class THIA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class TOCPHA(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITARAE(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITB12(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITB6A(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITC(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITD(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class VITK1(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class WATER(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )

                data class ZN(
                    @SerializedName("label")
                    val label: String? = null,
                    @SerializedName("quantity")
                    val quantity: Double? = null,
                    @SerializedName("unit")
                    val unit: String? = null
                )
            }
        }
    }
}