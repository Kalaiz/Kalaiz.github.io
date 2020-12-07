import kotlinx.browser.document
import kotlinx.css.*
import react.dom.render
import styled.css
import styled.injectGlobal
import styled.styledDiv
import styled.styledH1


const val backgroundBaseColor = "#162157"
fun main() {

    val htmlTagCSSBuilder = CSSBuilder()
    htmlTagCSSBuilder.apply {
        html {
            height = 100.pct
            background =  backgroundBaseColor
            overflowY = Overflow.scroll
            overflowX=Overflow.hidden

        }
    }

    injectGlobal(htmlTagCSSBuilder.toString())

    render(document.getElementById("root")) {
        child(MovingBackGround::class) {}

        styledDiv {
            css{
                width =100.pct
                position=Position.absolute
                top=30.pct
                alignContent=Align.center
            }
            styledDiv {
                css{
                    width =100.pct
                    display=Display.flex
                    flexDirection=FlexDirection.column
                    alignItems=Align.center
                }
                styledDiv {
                    styledH1 {
                        +"Hi! I am Kalai."
                        css {
                            fontWeight= FontWeight.bold
                            fontSize= 8.vmin
                            color = Color.whiteSmoke
                            fontFamily = "Courier New"
                            textAlign=TextAlign.center
                        }
                    }


                }
                child(Contact::class) {}

            }
        }

    }

}







