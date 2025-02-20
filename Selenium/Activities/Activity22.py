from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/popups")
    wait = WebDriverWait(driver, 5)
    print("Title of the page: " +driver.title)

    driver.find_element(By.ID, "launcher").click()
    wait.until(expected_conditions.element_to_be_clickable(driver.find_element(By.ID, "username")))

    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[text() = 'Submit']").click()

    heading_after_login = driver.find_element(By.TAG_NAME,'h1')
    wait.until(expected_conditions.visibility_of(heading_after_login))

    print(heading_after_login.text)
    driver.close()

