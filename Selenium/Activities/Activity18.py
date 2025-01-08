# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/alerts")
    # Print the title of the page
    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "simple").click()
    simple_alert=wait.until(EC.alert_is_present())
    print("text on alert : ",simple_alert.text)
    simple_alert.accept()
    print("final text on alert after accept : ",driver.find_element(By.ID, "result").text)