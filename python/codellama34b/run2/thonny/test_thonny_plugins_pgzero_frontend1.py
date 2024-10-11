import unittest
from thonny.plugins.pgzero_frontend import *

class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        toggle_variable()

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment(self):
        update_environment()

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        load_plugin()

if __name__ == '__main__':
    unittest.main()