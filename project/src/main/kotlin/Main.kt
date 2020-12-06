import kotlinx.browser.document
import kotlinx.css.*
import react.dom.link
import react.dom.render
import styled.injectGlobal


fun main() {


    render(document.getElementById("root")) {
        child(App::class) {}
    }
}

//  injectGlobal(string)

