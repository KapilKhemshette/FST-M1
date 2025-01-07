from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print("tile is : ",driver.title)
    driver.find_element(By.LINK_TEXT, "About Us").click()

    # Print the title of the new page
    print("New page title is: ", driver.title)
