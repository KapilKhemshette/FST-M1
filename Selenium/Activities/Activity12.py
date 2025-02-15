
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://training-support.net/webelements/dynamic-content")
    print("Title of the page - " +driver.title)

    click_me_button = driver.find_element(By.ID, "genButton")
    click_me_button.click()

    wait.until(expected_conditions.text_to_be_present_in_element
               ((By.XPATH, "//h2[text() = 'release']"), "release"))
    print("Printing word in console "+driver.find_element(By.XPATH, "//h2[text() = 'release']").text)

    driver.close()


