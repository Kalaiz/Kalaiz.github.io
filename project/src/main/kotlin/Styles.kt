import kotlinx.css.*
import styled.StyleSheet

object ComponentStyles : StyleSheet("CommonStyles") {
   val star by css{
       borderRadius = 50.pct
       background = "transparent"
   }

    val medStarDim by css{
        width = 0.215.vmin
        height = 0.215.vmin
    }

    val smallStarDim by css{
        width = 0.005.vmin
        height = 0.005.vmin
    }

    val tint by css{
        filter = "brightness(0) saturate(100%) invert(100%) sepia(100%) saturate(0%) hue-rotate(8deg) brightness(105%) contrast(101%)"
    }

    val content by css{
        textAlign= TextAlign.center
        color = Color.whiteSmoke
        height= LinearDimension.fitContent
    }

}