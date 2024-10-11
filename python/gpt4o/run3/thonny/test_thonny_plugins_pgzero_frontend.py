import unittest
from unittest.mock import patch, MagicMock
import os
from thonny.plugins.pgzero_frontend import toggle_variable, update_environment, load_plugin


class TestPgzeroFrontend(unittest.TestCase):
    @patch('thonny.plugins.pgzero_frontend.get_workbench')
    def test_toggle_variable(self, mock_get_workbench):
        mock_var = MagicMock()
        mock_var.get.return_value = False
        mock_get_workbench.return_value.get_variable.return_value = mock_var
        
        toggle_variable()
        
        mock_var.set.assert_called_once_with(True)
        mock_get_workbench.return_value.get_variable.assert_called_once_with("run.pgzero_mode")

    @patch('thonny.plugins.pgzero_frontend.get_workbench')
    @patch('thonny.plugins.pgzero_frontend.os')
    def test_update_environment_simple_mode(self, mock_os, mock_get_workbench):
        mock_get_workbench.return_value.in_simple_mode.return_value = True
        
        update_environment()
        
        mock_os.environ.__setitem__.assert_called_once_with("PGZERO_MODE", "auto")

    @patch('thonny.plugins.pgzero_frontend.get_workbench')
    @patch('thonny.plugins.pgzero_frontend.os')
    def test_update_environment_not_simple_mode(self, mock_os, mock_get_workbench):
        mock_get_workbench.return_value.in_simple_mode.return_value = False
        mock_get_workbench.return_value.get_option.return_value = True
        
        update_environment()
        
        mock_os.environ.__setitem__.assert_called_once_with("PGZERO_MODE", "True")
        mock_get_workbench.return_value.get_option.assert_called_once_with("run.pgzero_mode")

    @patch('thonny.plugins.pgzero_frontend.get_workbench')
    def test_load_plugin(self, mock_get_workbench):
        load_plugin()
        
        mock_get_workbench.return_value.set_default.assert_called_once_with("run.pgzero_mode", False)
        mock_get_workbench.return_value.add_command.assert_called_once_with(
            "toggle_pgzero_mode",
            "run",
            "Pygame Zero mode",
            toggle_variable,
            flag_name="run.pgzero_mode",
            group=40,
        )

if __name__ == '__main__':
    unittest.main()