from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:

    driver.get("https://training-support.net/webelements/keyboard-events")
    print("Title of the page - " +driver.title)
    actions = webdriver.ActionChains(driver)

    actions.send_keys("Anu ").pause(2).send_keys(Keys.RETURN).pause(2).perform()
    message = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text
    print(message)

    driver.close()
