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

    # Find and click the button to open the alert
    driver.find_element(By.ID, "prompt").click()
    prompt_alert=wait.until(EC.alert_is_present())
    alertText = prompt_alert.text
    print("Text in alert: " + alertText)
    prompt_alert.send_keys("Awesome!")
    prompt_alert.accept()

    print("final result on prompt:",driver.find_element(By.ID,"result").text)  

