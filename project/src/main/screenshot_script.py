from selenium import webdriver
import os
import sys
import time

FILE_TAG = "file:///"

driver = webdriver.Chrome() 

# main>src>project > root
os.chdir("../../../")


url =  FILE_TAG + os.path.abspath("docs/index.html")


driver.get(url) 

driver.save_screenshot("docs/images/social-media-template.png") 


time.sleep(1.5)
driver.close()

sys.exit()
