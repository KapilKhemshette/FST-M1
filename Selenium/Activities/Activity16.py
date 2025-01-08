from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

# Start the Driver
with webdriver.Firefox() as driver:
    
    driver.get("https://training-support.net/webelements/selects")
    # Print the title of the page
    print("Page title is: ", driver.title)
    dropdown=driver.find_element(By.CSS_SELECTOR,"select.h-10")
    select=Select(dropdown)
    two=select.select_by_visible_text("Two")
    print("select option : ",select.first_selected_option.text)
    three=select.select_by_index(3)
    print("select option : ",select.first_selected_option.text)
    four=select.select_by_value("four")
    print("select option : ",select.first_selected_option.text)
    alloptions=select.options
    for options in alloptions:
        print(options.text)

