from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Title of the page is " + driver.title)

    checkbox_element = driver.find_element(By.XPATH, "//*[@id = 'checkbox']")
    print("Before toggling checkbox, check box is:  "+ str(checkbox_element.is_displayed()))

    driver.find_element(By.XPATH, "//*[text()='Toggle Checkbox']").click()
    print("After toggling checkbox, check box is:  " + str(checkbox_element.is_displayed()))

    driver.close()

