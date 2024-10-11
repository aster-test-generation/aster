from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        toggle_variable()
        self.assertEqual(get_workbench().get_variable(_OPTION_NAME), True)

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment(self):
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        load_plugin()
        self.assertEqual(get_workbench().get_default(_OPTION_NAME), False)

if __name__ == '__main__':
    unittest.main()