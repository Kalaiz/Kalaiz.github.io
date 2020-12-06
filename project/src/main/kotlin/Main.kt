import kotlinx.browser.document
import kotlinx.css.*
import kotlinx.css.properties.transform
import kotlinx.css.properties.translate
import react.dom.h1
import react.dom.render
import styled.css
import styled.injectGlobal
import styled.styledH1


fun main() {
    injectGlobal(" html {\n" +
            "  height: 100%;\n" +
            "  background: radial-gradient(ellipse at bottom, #37577d 30%, #162157 100%);\n" +
            "  overflow: hidden;\n" +
            "}")


    render(document.getElementById("root")) {

        styledH1{
            +"Hi! I am Kalai."

            css{
                color= Color.whiteSmoke
                fontFamily= "Courier New"
                position = Position.absolute
                top=40.pct
                left=0.px
                right=0.px
                textAlign=TextAlign.center

            }
        }
        child(App::class) {}


    }


}



