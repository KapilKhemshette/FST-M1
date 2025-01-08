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
    driver.find_element(By.ID, "confirmation").click()
    confirmation_alert=wait.until(EC.alert_is_present())
    alertText = confirmation_alert.text
    print("Text in alert: " + alertText)
    confirmation_alert.dismiss()
    print(driver.find_element(By.ID, "result").text)