import unittest
from thonny.plugins.pgzero_frontend import toggle_variable, update_environment, load_plugin, get_workbench


class TestPgzeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        # Set the initial value of the variable
        get_workbench().set_variable(_OPTION_NAME, False)
        toggle_variable()
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_update_environment_simple_mode(self):
        # Set the workbench to simple mode
        get_workbench().set_simple_mode(True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

    def test_update_environment_normal_mode(self):
        # Set the workbench to normal mode
        get_workbench().set_simple_mode(False)
        get_workbench().set_variable(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "True")

    def test_load_plugin(self):
        load_plugin()
        self.assertTrue(get_workbench().has_command("toggle_pgzero_mode"))

    def test_get_workbench(self):
        # Test the get_workbench function
        wb = get_workbench()
        self.assertIsNotNone(wb)

    def test_get_workbench_in_simple_mode(self):
        # Test the in_simple_mode method
        get_workbench().set_simple_mode(True)
        self.assertTrue(get_workbench().in_simple_mode())

    def test_get_workbench_get_variable(self):
        # Test the get_variable method
        get_workbench().set_variable(_OPTION_NAME, True)
        var = get_workbench().get_variable(_OPTION_NAME)
        self.assertTrue(var.get())

    def test_get_workbench_set_default(self):
        # Test the set_default method
        get_workbench().set_default(_OPTION_NAME, True)
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_get_workbench_add_command(self):
        # Test the add_command method
        get_workbench().add_command("test_command", "run", "Test command", lambda: None)
        self.assertTrue(get_workbench().has_command("test_command"))

if __name__ == '__main__':
    unittest.main()