from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestPgzeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        get_workbench().set_default(_OPTION_NAME, False)
        toggle_variable()
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_update_environment_simple_mode(self):
        get_workbench().set_simple_mode(True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

    def test_update_environment_normal_mode(self):
        get_workbench().set_simple_mode(False)
        get_workbench().set_option(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "True")

    def test_load_plugin(self):
        load_plugin()
        self.assertTrue(get_workbench().has_command("toggle_pgzero_mode"))

    def test_get_workbench(self):
        wb = get_workbench()
        self.assertIsNotNone(wb)

    def test_get_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        self.assertIsNotNone(var)

    def test_set_default(self):
        get_workbench().set_default(_OPTION_NAME, True)
        self.assertTrue(get_workbench().get_option(_OPTION_NAME))

    def test_add_command(self):
        get_workbench().add_command(
            "test_command",
            "run",
            "Test command",
            lambda: None,
            flag_name=_OPTION_NAME,
            group=40,
        )
        self.assertTrue(get_workbench().has_command("test_command"))

if __name__ == '__main__':
    unittest.main()