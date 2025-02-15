from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:

    wait = WebDriverWait(driver, 2)
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Title of the page: " + driver.title)

    checkbox_element = driver.find_element(By.ID, "checkbox")
    toggle_checkbox = driver.find_element(By.XPATH, "//*[text() = 'Toggle Checkbox']")

    toggle_checkbox.click()
    wait.until(expected_conditions.invisibility_of_element(checkbox_element))
    if checkbox_element.is_displayed():
        print("Checkbox still in visible in first toggle")
    else: print("Checkbox is disappeared after first toggle")

    toggle_checkbox.click()
    wait.until(expected_conditions.visibility_of(checkbox_element))
    if checkbox_element.is_displayed():
        print("Checkbox is visible after second toggle")
    else:
        print("Checkbox is not yet disappeared in second toggle")
    checkbox_element.click()
    print("check box is selected " +str(checkbox_element.is_selected()))

    driver.close()

