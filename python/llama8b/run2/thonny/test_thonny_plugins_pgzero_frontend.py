from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        var.set(True)
        toggle_variable()
        self.assertFalse(var.get())

    def test_toggle_variable_already_off(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        var.set(False)
        toggle_variable()
        self.assertTrue(var.get())

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment_in_simple_mode(self):
        get_workbench().in_simple_mode = True
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

    def test_update_environment_not_in_simple_mode(self):
        get_workbench().in_simple_mode = False
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "False")

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        load_plugin()
        self.assertIn("toggle_pgzero_mode", get_workbench().commands)

    def test_load_plugin_already_loaded(self):
        load_plugin()
        load_plugin()
        self.assertIn("toggle_pgzero_mode", get_workbench().commands)

class TestGetWorkbench(unittest.TestCase):
    def test_get_workbench(self):
        workbench = get_workbench()
        self.assertIsNotNone(workbench)

    def test_get_workbench_already_get(self):
        workbench = get_workbench()
        get_workbench()
        self.assertEqual(workbench, get_workbench())

if __name__ == '__main__':
    unittest.main()