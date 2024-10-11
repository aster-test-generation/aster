import unittest
import os
from thonny import get_workbench
from thonny.languages import tr

_OPTION_NAME = "run.pgzero_mode"

def toggle_variable():
    var = get_workbench().get_variable(_OPTION_NAME)
    var.set(not var.get())
    update_environment()

def update_environment():
    if get_workbench().in_simple_mode():
        os.environ["PGZERO_MODE"] = "auto"
    else:
        os.environ["PGZERO_MODE"] = str(get_workbench().get_option(_OPTION_NAME))

def load_plugin():
    get_workbench().set_default(_OPTION_NAME, True)
    get_workbench().add_command(
        "toggle_pgzero_mode",
        "run",
        tr("Pygame Zero mode"),
        toggle_variable,
        flag_name=_OPTION_NAME,
        group=40,
    )
    update_environment()

class TestToggleVariable(unittest.TestCase):
    def test_toggle_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        self.assertFalse(var.get())
        toggle_variable()
        self.assertTrue(var.get())
        toggle_variable()
        self.assertFalse(var.get())

class TestUpdateEnvironment(unittest.TestCase):
    def test_update_environment(self):
        os.environ["PGZERO_MODE"] = "manual"
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "manual")
        get_workbench().set_default(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

class TestLoadPlugin(unittest.TestCase):
    def test_load_plugin(self):
        load_plugin()
        self.assertEqual(get_workbench().get_option(_OPTION_NAME), False)
        get_workbench().set_default(_OPTION_NAME, True)
        load_plugin()
        self.assertEqual(get_workbench().get_option(_OPTION_NAME), True)

if __name__ == '__main__':
    unittest.main()