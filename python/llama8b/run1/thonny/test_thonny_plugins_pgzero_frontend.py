from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        var.set(True)
        toggle_variable()
        self.assertFalse(var.get())

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment(self):
        if get_workbench().in_simple_mode():
            os.environ["PGZERO_MODE"] = "auto"
        else:
            os.environ["PGZERO_MODE"] = "False"

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        load_plugin()
        self.assertTrue(get_workbench().has_command("toggle_pgzero_mode"))

class TestGetWorkbench(unittest.TestCase):
    def test_get_workbench(self):
        workbench = get_workbench()
        self.assertIsNotNone(workbench)

class TestGetVariable(unittest.TestCase):
    def test_get_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        self.assertIsNotNone(var)

class TestSetVariable(unittest.TestCase):
    def test_set_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        var.set(True)
        self.assertTrue(var.get())

class TestGetOption(unittest.TestCase):
    def test_get_option(self):
        option = get_workbench().get_option(_OPTION_NAME)
        self.assertIsNotNone(option)

class TestAddCommand(unittest.TestCase):
    def test_add_command(self):
        get_workbench().add_command(
            "toggle_pgzero_mode",
            "run",
            "Pygame Zero mode",
            toggle_variable,
            flag_name=_OPTION_NAME,
            group=40,
        )
        self.assertTrue(get_workbench().has_command("toggle_pgzero_mode"))

class TestGetDefault(unittest.TestCase):
    def test_get_default(self):
        get_workbench().set_default(_OPTION_NAME, False)
        self.assertFalse(get_workbench().get_option(_OPTION_NAME))

if __name__ == '__main__':
    unittest.main()