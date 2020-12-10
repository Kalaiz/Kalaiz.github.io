import body.Body
import footer.Footer
import kotlinx.browser.document
import kotlinx.css.*
import react.dom.render
import styled.injectGlobal


const val backgroundBaseColor = "#162157"

fun main() {

    /*Since CSS is created dynamically, Injecting HTML Tag CSS attributes*/
    val htmlTagCSSBuilder = CSSBuilder()
    htmlTagCSSBuilder.apply {
        html {
            background =  backgroundBaseColor
            overflow = Overflow.hidden
        }
    }
    injectGlobal(htmlTagCSSBuilder.toString())

    render(document.getElementById("root")) {
        child(MovingBackground::class) {}
        child(Body::class){}
        child(Footer::class){}
    }

}

