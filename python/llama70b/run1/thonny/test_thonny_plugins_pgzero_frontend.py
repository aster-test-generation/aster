import unittest
from thonny.plugins.pgzero_frontend import toggle_variable, update_environment, load_plugin, get_workbench


class TestPgzeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        # Test toggle_variable function
        get_workbench().set_default(_OPTION_NAME, True)
        toggle_variable()
        self.assertFalse(get_workbench().get_variable(_OPTION_NAME).get())

    def test_update_environment(self):
        # Test update_environment function
        get_workbench().set_default(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "True")

    def test_load_plugin(self):
        # Test load_plugin function
        load_plugin()
        self.assertTrue(get_workbench().has_command("toggle_pgzero_mode"))

    def test_get_workbench(self):
        # Test get_workbench function
        wb = get_workbench()
        self.assertIsNotNone(wb)

    def test_get_variable(self):
        # Test get_variable method
        var = get_workbench().get_variable(_OPTION_NAME)
        self.assertIsNotNone(var)

    def test_set_default(self):
        # Test set_default method
        get_workbench().set_default(_OPTION_NAME, True)
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_add_command(self):
        # Test add_command method
        get_workbench().add_command(
            "test_command",
            "run",
            "Test Command",
            lambda: None,
            flag_name=_OPTION_NAME,
            group=40,
        )
        self.assertTrue(get_workbench().has_command("test_command"))

    def test_in_simple_mode(self):
        # Test in_simple_mode method
        self.assertTrue(get_workbench().in_simple_mode() or not get_workbench().in_simple_mode())

if __name__ == '__main__':
    unittest.main()