from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestPGZeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        get_workbench().set_variable(_OPTION_NAME, False)
        toggle_variable()
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_update_environment_simple_mode(self):
        get_workbench().set_option("run.simple_mode", True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

    def test_update_environment_not_simple_mode(self):
        get_workbench().set_option("run.simple_mode", False)
        get_workbench().set_option(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "True")

    def test_load_plugin_default_option(self):
        get_workbench().set_default(_OPTION_NAME, True)
        load_plugin()
        self.assertTrue(get_workbench().get_option(_OPTION_NAME))

    def test_load_plugin_command(self):
        load_plugin()
        self.assertEqual(get_workbench().get_command("toggle_pgzero_mode"), toggle_variable)

if __name__ == '__main__':
    unittest.main()