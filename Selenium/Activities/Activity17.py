# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/selects")
    # Print the title of the page
    print("Page title is: ", driver.title)
    selectElement = driver.find_element(By.CSS_SELECTOR, "select.h-80")
    multiSelect = Select(selectElement)
    multiSelect.select_by_visible_text("HTML")
    for i in range(3, 5):
        multiSelect.select_by_index(i)
    multiSelect.select_by_value("nodejs")
    selectedoptions=multiSelect.all_selected_options
    for i in selectedoptions:
        print(i.text)