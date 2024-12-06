package us.smt.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import us.smt.presentation.databinding.ScreenMenuTabBinding

class MainTabScreen : Fragment(R.layout.screen_menu_tab) {
    private var _binding: ScreenMenuTabBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = ScreenMenuTabBinding.bind(view)
        val navHostFragment = childFragmentManager.findFragmentById(
            R.id.nav_host_fragment
        ) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}