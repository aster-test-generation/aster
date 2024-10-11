import unittest
from thonny.plugins.pgzero_frontend import *


class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        result = toggle_variable()
        self.assertEqual(result, not var.get())

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment(self):
        result = update_environment()
        self.assertEqual(result, os.environ["PGZERO_MODE"])

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        result = load_plugin()
        self.assertEqual(result, None)

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